class AcceptLanguage {

    fun parseAcceptLanguage(accept: String, supportedLanguages: Set<String>): List<String> {
        val acceptTags = splitHeaderIntoTags(accept)

        val resultTags = mutableListOf<String>()
        for (tag in acceptTags) {
            if (tag.length == 2) {
                supportedLanguages.forEach {
                    if (it.startsWith(tag) && !resultTags.contains(it)) {
                        resultTags.add(it)
                    }
                }

            } else if (tag.length > 2){
                if (supportedLanguages.contains(tag)) {
                    if (!resultTags.contains(tag)) {
                        resultTags.add(tag)
                    }
                }
            } else if (tag == "*") {
                supportedLanguages.forEach {
                    if (!resultTags.contains(it)) {
                        resultTags.add(it)
                    }
                }
            }
        }

        return resultTags
    }


    fun splitHeaderIntoTags(header: String): Set<String> {
        return header.split(", ").toSet()
    }

}
