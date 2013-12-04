def str1 = 'string'
def str2 = "another string"

def name = "alex"

println 'Hello ${name}'
println "Hello ${name}"

def message = "Groovy is Cool"
println "1st char: ${message[0]}"
println "Lasts char: ${message[-1]}"

println message[0..(message.length()-1)]