package listaDeTareas

import nombreDeTareas.nombreDeTareas

class listaDeTareas (
        private var listName: String,
        private var tareas: ArrayList<nombreDeTareas> = ArrayList<nombreDeTareas>()

) {
    fun setTasksOnList(taskName: nombreDeTareas){
        tareas.add(taskName)
    }

    fun removeTaskOnList(indice: Int){
        tareas.removeAt(indice)
        print("Tarea ${indice + 1} removida exitosamente")
    }

    fun getTasksOnList(){
        for (i in tareas.indices){
            println("${i + 1}. ${tareas[i]}")
        }
    }

    fun setListName(name: String){
        listName = name
    }

    fun getListName(): String{
        return listName
    }


    override fun toString(): String {
        return "Nombre de Lista: $listName"
    }
}
