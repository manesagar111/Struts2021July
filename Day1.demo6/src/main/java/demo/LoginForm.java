package demo;

		import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
		 
		public class LoginForm extends ActionForm {
		 
			private String userName = null;
			private String password = null;
		 
			public String getUserName() {
				return userName;
			}
		 
			public void setUserName(String userName) {
				this.userName = userName;
			}
		 
			public String getPassword() {
				return password;
			}
		 
			public void setPassword(String password) {
				this.password = password;
			}
		 
			@Override
			public void reset(ActionMapping mapping, HttpServletRequest request) {
				this.password = null;
			} 
		 
			@Override
			public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
				System.out.println("Validate Method of LoginForm invoked ..." + this.userName + ", " + this.password);
				ActionErrors errs = new ActionErrors();
				if (this.userName.length() < 5)
				{
					errs.add("userName", new ActionMessage("logicform.username.minlength"));
				}
				return errs;
			}
		}