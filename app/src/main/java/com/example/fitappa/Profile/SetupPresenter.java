package com.example.fitappa.Profile;

/**
 * This class is a presenter class for ViewSetupActivity
 * <p>
 * The method in the class moves the information to DashboardActivity
 *
 * @author Souren
 * @since 0.1
 */

class SetupPresenter {
    private final Profile profile;
    private final View view;
    private final SetupInformation setupInformation;

    /**
     * A constructor for SetupInformation
     *
     * @param view             the ViewSetupActivity
     * @param profile          a users Profile
     * @param setupInformation a users SetupInformation
     */
    public SetupPresenter(SetupPresenter.View view, Profile profile, SetupInformation setupInformation) {
        this.view = view;
        this.profile = profile;
        this.setupInformation = setupInformation;
    }

    /**
     * Fills the SetupInformation class
     *
     * @param w a String weight
     * @param h a String height
     * @param f a String first name
     * @param l a String last name
     */
    void setUp(String w, String h, String f, String l) {

        setupInformation.setWeight(w);
        setupInformation.setHeight(h);
        setupInformation.setFirstName(f);
        setupInformation.setLastName(l);
        profile.setSetupInformation(setupInformation);
        view.goToHome(profile);
    }

    interface View {
        /**
         * Goes to the DashboardActivity
         *
         * @param profile puts in a persons profile
         */
        void goToHome(Profile profile);
    }
}