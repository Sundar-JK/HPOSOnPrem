package pojo;
//my new
import java.util.List;

public class UsersLogin {

	 @Override
		public String toString() {
			return "UsersLogin [user=" + user + ", branch=" + branch + "]";
		}

		private userss user;
	    private List<Branch> branch;

	    public UsersLogin() {}

	    public UsersLogin(userss user, List<Branch> branch) {
	        this.user = user;
	        this.branch = branch;
	    }

	    public userss getUser() {
	        return user;
	    }

	    public void setUsers(userss user2) {
	        this.user = user2;
	    }

	    public List<Branch> getBranch() {
	        return branch;
	    }

	    public void setBranch(List<Branch> branch) {
	        this.branch = branch;
	    }

		public void setBranch(String branchInfoListJson) {
			// TODO Auto-generated method stub
			
		}

		public void setUser(userss user2) {
			// TODO Auto-generated method stub
			
		}

}
