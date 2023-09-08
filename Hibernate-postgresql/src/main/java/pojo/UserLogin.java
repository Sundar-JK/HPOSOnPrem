package pojo;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class UserLogin {
	
    @Override
	public String toString() {
		return "UserLogin [user=" + user + ", branch=" + branch + "]";
	}

	private users user;
    private List<branch> branch;

    public UserLogin() {}

    public UserLogin(users user, List<branch> branch) {
        this.user = user;
        this.branch = branch;
    }

    public users getUser() {
        return user;
    }

    public void setUser(users user) {
        this.user = user;
    }

    public List<branch> getBranch() {
        return branch;
    }

    public void setBranch(List<branch> branch) {
        this.branch = branch;
    }

	public void setBranch(String branchInfoListJson) {
		// TODO Auto-generated method stub
		
	}

	 
}
