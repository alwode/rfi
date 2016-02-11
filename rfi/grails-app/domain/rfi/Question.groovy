package rfi

class Question {

	String questionText
	String answerText
	String assessment 
	
	static belongsTo = [catalog: Catalog]
    static constraints = {
		questionText()
		answerText()
		assessment()
    }
}
