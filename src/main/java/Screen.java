public class Screen {
    private Profile profile;
    public Screen(Profile profile){
        this.profile = profile;

    }

    public void showFollowers(){
        for(Object key: profile.getProfileFollower().keySet()) {
            System.out.println(key);
        }
    }
    public void showFollowing(){
        for(Object key: profile.getProfileFollowing().keySet()){
            System.out.println(key);
        }
    }
    public void showUserInfo(){
        System.out.print(profile.getUser().getUsername());
        System.out.print(profile.getUser().getEmail());
        System.out.print(profile.getUser().getPassword());

    }

}
