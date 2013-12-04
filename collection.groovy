def languages = ['groovy', 'haskwell', 'java']

println "Languages: ${languages.join(', ')}"

def myMap = [company: 'SpringSource', instructor: 'Peter Ledbrook']

myMap.each { key,value ->
	println "Map entry: ${key} is ${value}"
}

def l = [3,6,23,-10,9,-1,-34,3,14]
println l.find { it > 10 }
println l.findAll { it > 10 }

println l.collect { it - 3 }