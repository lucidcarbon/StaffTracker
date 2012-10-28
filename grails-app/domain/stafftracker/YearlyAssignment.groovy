package stafftracker

class YearlyAssignment {
	String year
	Boolean cabinStaff
	Boolean applied
	Boolean confirmed
	Boolean served
	String background
	String note
	String sleepingIn
	static belongsTo = [person : Person]
	String toString () {
		"${year}"
	}

    static constraints = {
		year()
		applied()
		confirmed()
		served()
		background()
		cabinStaff()
		sleepingIn()
		note()
		note(maxSize: 500)
		sleepingIn(inList: ["cabin","sick bay","14","15","off site"])
		background(inList: ["ordered","passed","failed"])
		year(inList: ["2011","2012"])
    }
}
