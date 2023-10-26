package cleancode.ch03.function.exercise;

public class UserValidator {

	private Cryptographer cryptographer;

	public boolean checkPassword(String userName, String password) {
		User user = UserGateway.findByName(userName);
		if (user != User.NULL) {
			String codedPhrase = user.getPhraseEncodedByPassword();
			String phrase = cryptographer.decrypt(codedPhrase, password);
			if ("Valid Password".equals(phrase)) {
				Session.initialize();
				return true;
			}
		}
		return false;
	}

	public void deleteKey() {
		if (deletePage(page) == E_OK) {
			if (registry.deleteReference(page.name) == E_OK) {
				if (configKeys.deleteKey(page.name.makeKey()) == E_OK) {
					logger.log("page deleted");
				} else {
					logger.log("configKey not deleted");
				}
			} else {
				logger.log("deleteReference from registry failed");
			}
		} else {
			logger.log("delete failed");
			return E_ERROR;
		}
	}
	
	public void render(boolean isSuite) {
		
	}
}
