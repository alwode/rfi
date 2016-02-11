package rfi

class Catalog {

	String catalogName
	String catalogVersion
	
	static hasMany = [questions: Question]
	
    static constraints = {
		catalogName()
		catalogVersion()
    }
}
