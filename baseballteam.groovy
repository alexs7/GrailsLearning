import groovy.transform.Immutable

@Immutable
class BaseBallTeam {
	String cityName
	String teamName

	String getDisplayName(){
		cityName + " " + teamName
	}

}

def myTeam = new BaseBallTeam(cityName: "Limassol", teamName: "AEL")

println "Team: "+myTeam.getDisplayName()