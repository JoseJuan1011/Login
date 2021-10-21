package dad.login;

import org.apache.commons.codec.digest.DigestUtils;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;

public class Main {
	
	public static void main(String[] args) throws Exception {
		App.main(args);
//		boolean useLdap = true;
//		
//		AuthService ldap = useLdap ? new LdapAuthService() : new FileAuthService();
//		System.out.println("Chuck Norris    : " + ldap.login("cnorris", "patada"));
//		System.out.println("Charles Bronson : " + ldap.login("cbronson", "pistola"));
//		System.out.println("David Carradine : " + ldap.login("dcarradine", "kungfu"));
//		System.out.println("David Carradine : " + ldap.login("dcarradine", "karate"));
//		System.out.println("Michael Knight  : " + ldap.login("mknight", "kit"));
//		
	}

}
