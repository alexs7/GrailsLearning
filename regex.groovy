def testString = "The rain in Spain falls mainly in the plain"

assert testString =~ /ain/

def m = testString =~ /(\w*)ain(\w*)/

assert m instanceof java.util.regex.Matcher

if (m) {
	for (match)
}