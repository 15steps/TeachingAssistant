package ta

class ClassController {

    /**
     * Maps URI /class
     */
    def index() {
        respond Class.list(params)
    }

    /**
     * Maps /class/add
     */
    def add() {
        Class c = new Class(description: params.className)
    }

    def show() {
        [book: Class.get(params.id)]
    }
}
