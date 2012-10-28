package stafftracker

class PersonController {
	static scaffold = true
	
  //  def index = {
//		redirect (action: list)
//	}
	
	def current = {
		def People = Person.withCriteria {
			assignments {
				ilike('year','2012')
			}
		}
		[people: People]
	}
}
