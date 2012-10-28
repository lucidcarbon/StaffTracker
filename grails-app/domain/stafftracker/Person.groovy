package stafftracker

class Person {
	String firstName
	String lastName
	String email
	String cell
	String streetAddress
	String city
	String state
	String zip
	String gender
	String shirtSize
	Date	dateOfBirth
	String socialSecurityNumber
	String toString () {
		"${firstName} ${lastName}"
	}
	static hasMany = [assignments : YearlyAssignment ]

    static constraints = {
		firstName ()
		lastName ()
		email ()
		cell ()
		streetAddress ()
		city ()
		state ()
		zip()
		gender()
		dateOfBirth()
		socialSecurityNumber()
		shirtSize()
		gender(inList: ["male","female"])
		shirtSize(inList: ["small","medium","large","x-large","xx-large","xxx-large"])
    }
}
