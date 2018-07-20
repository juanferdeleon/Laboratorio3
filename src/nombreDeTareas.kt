package nombreDeTareas

class nombreDeTareas(
        private var taskName: String
){
    fun nombreDeTareas(name: String){
        setTaskName(name)
    }

    fun setTaskName(name: String){
        taskName = name
    }

    fun getTaskName(): String{
        return taskName
    }

}