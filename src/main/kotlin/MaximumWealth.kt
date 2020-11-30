class MaximumWealth {
    fun maximumWealth(accounts: Array<IntArray>) = accounts.map { it.sum() }
        .maxOrNull()!!
}
