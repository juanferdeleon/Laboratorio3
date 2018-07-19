package listaDeTareas

class listaDeTareas (
        private var listName: String
) {
    fun listaDeTareas(listName: String){

        setListName(listName)

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