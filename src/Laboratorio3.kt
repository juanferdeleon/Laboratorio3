package main

import listaDeTareas.listaDeTareas
import nombreDeTareas.nombreDeTareas

fun main(args: Array<String>){

    fun menuPrincipal(taskListIndices: Int): String{
        if(taskListIndices == 0){
            return """Menu:
                1. Crear lista de tareas
                2. Salir
                Seleccione una opcion:""".trimIndent()
        }

        return """Menu:
                1. Crear lista de tareas
                2. Ver listas de tareas
                3. Seleccionar una lista de tareas
                4. Salir
                Seleccione una opcion:""".trimIndent()
    }

    fun listMenu(): String{
        return """Menu:
            1. Volver
            2. Agregar una tarea
            3. Completar una tarea
            4. Ver todas las tareas en la lista
            5. Salir
        """.trimIndent()
    }

    fun opcionMenus(taskListIndices: Int): Boolean{

        var opMenu: Boolean = false

        if (taskListIndices == 0){
            return opMenu
        }

        opMenu = true
        return opMenu
    }

    var taskList: ArrayList<listaDeTareas> = java.util.ArrayList<listaDeTareas>()
    var wantsToContinue: Boolean = true

    do{
        print(menuPrincipal(taskList.count()))

        if(!opcionMenus(taskList.count())){

            val op: String? = readLine()!!

            when(op){
                "1" -> {

                    print("Ingrese Nombre de Lista a Crear: ")
                    var listName: String = readLine()!!
                    val listaDeTareas = listaDeTareas(listName)
                    taskList.add(listaDeTareas)

                }
                "2" -> {
                    wantsToContinue = false
                }

            }
        }else{
            val op: String? = readLine()!!

            when (op){
                "1" -> {
                    println("Ingrese Nombre de Lista a Crear:")
                    var listName: String = readLine()!!
                    val listaDeTareas = listaDeTareas(listName)
                    taskList.add(listaDeTareas)
                }

                "2" -> {

                    for (i in taskList.indices){
                        println("Nombre de la lista: " + taskList[i].getListName())
                    }
                }

                "3" -> {
                    var isOnList: Boolean = true
                    println("Listas:")
                    for (i in taskList.indices){
                        println("${i + 1}. " + taskList[i].getListName())
                    }
                    print("Ingrese numero de lista: ")
                    var listNumber: String = readLine()!!
                    var indice = listNumber.toInt()
                    indice --

                    do{
                        println(listMenu())
                        print("Ingrese una opcion: ")
                        var op: String = readLine()!!
                        when (op){
                            "1" -> {
                               isOnList = false
                            }
                            "2" -> {
                                print("Ingrese una tarea: ")
                                var taskName: String = readLine()!!
                                var task = nombreDeTareas(taskName)
                                taskList[indice].setTasksOnList(task)
                            }
                            "3" -> {
                                println("Tareas: ")
                                taskList[indice].getTasksOnList()
                                print("Ingrese numero de tarea a completar: ")
                                var taskNum: String = readLine()!!
                                var index = taskNum.toInt()
                                index --
                                taskList[indice].removeTaskOnList(index)
                            }
                            "4" -> {
                                taskList[indice].getTasksOnList()
                            }
                            "5" -> {
                                isOnList = false
                                wantsToContinue = false
                            }
                        }
                    }while (isOnList)

                }

                "4" -> {
                    wantsToContinue = false
                }

            }
        }


    }while(wantsToContinue)

}