package drdgvhbh.com.github.ethwallet.service

typealias Mnemonic = String

class WalletService(
        private val walletRepository: WalletRepository
) {
    fun createWallet(password: String): Mnemonic {
        return walletRepository.create(password).mnemonic
    }
}