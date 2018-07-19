package main

import listaDeTareas.listaDeTareas

fun main(args: Array<String>){

    fun menuPrincipal(taskListIndices: Int): String{
        if(taskListIndices == 0){
            return """Menu:
                1. Crear lista de tareas
                2. Salir
                Seleccione una opcion:""".trimIndent()
        }

        return """\nMenu:
                1. Crear lista de tareas
                2. Ver listas de tareas
                3. Seleccionar una lista de tareas
                4. Salir
                Seleccione una opcion:""".trimIndent()
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
                        print("Nombre de la lista: " + taskList[i].getListName())
                    }
                }

                "3" -> {
                    print("Lol")
                }

                "4" -> {
                    wantsToContinue = false
                }

            }
        }


    }while(wantsToContinue)

}