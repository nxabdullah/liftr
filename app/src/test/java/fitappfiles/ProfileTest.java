package fitappfiles;

import com.example.fitappa.Model.Entity.User;
import com.example.fitappa.Model.UseCase.FollowManager;
import com.example.fitappa.Model.UseCase.Profile;
import com.example.fitappa.Model.UseCase.Routine;
import junit.framework.TestCase;

public class ProfileTest extends TestCase {
    Profile profile;
    Profile profile2;
    User user;
    User user2;
    FollowManager userf;
    FollowManager user2f;
    FollowManager user3f;
    Routine routine;


    public void setUp() throws Exception {
        profile = new Profile("Johnny", "johnny123", "johnnyappleseed@gmail.com");
        profile2 = new Profile("Hello", "world123", "helloworld@gmail.com");
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testGetUser() {
        user = new User("Johnny", "johnny123", "johnnyappleseed@gmail.com");
        user2 = new User("Hello", "world123", "helloworld@gmail.com");
        // sees if usernames and other elements of user matches that of the
        // user returned by getUser()
        assertEquals(user.getUsername(), profile.getUser().getUsername());
        assertNotSame(user2.getPassword(), profile.getUser().getPassword());
        assertEquals(user2.getEmail(), profile2.getUser().getEmail());
    }

    public void testGetProfileFollow() {
        user3f = new FollowManager(profile.getUser());
        assertNotSame(user3f, profile.getFollowManager()); //shows same data types are being compared
        //shows the getter works
        userf = profile.getFollowManager();
        userf.getFollowers().put("Username1", user2f);
        userf.getFollowing().put("Username2", user2f);
        user2f = profile2.getFollowManager();

        assertTrue(userf.getFollowers().containsKey("Username1"));
        assertTrue(userf.getFollowing().containsKey("Username2"));
        assertEquals(user2f, profile2.getFollowManager());
        assertNotSame(userf, profile2.getFollowManager()); //shows userf is not equal to user2f
    }

    public void testGetRoutines() {
        //shows that it matches the elements of the
        // hard coded routines
        assertEquals("My routine", profile.getRoutines().get(0).getName());
        assertEquals("My routine2", profile2.getRoutines().get(1).getName());
    }

    public void testAddRoutine() {
        //shows that the element has been added by looking at
        //size and matching name
        profile2.addRoutine(new Routine("My routine3", "My new routine"));
        assertEquals("My routine3", profile2.getRoutines().get(2).getName());
        assertEquals(3, profile2.getRoutines().size());

    }
}