package com.example.earthquake;
/**
 * {@Event} represents an earthquake event. It holds the details
 * of that event such as title (which contains magnitude and location
 * of the earthquake), as well as time, and whether or not a tsunami
 * alert was issued during the earthquake.
 */
public class Event {
    private final double mMagnitude;
    private final String mDistance;
    private final String mLocation;
    private final String mDate;
    private final String mTime;
    public Event(double mMagnitude, String mDistance, String mLocation, String mDate, String mTime) {
        this.mMagnitude = mMagnitude;
        this.mDistance = mDistance;
        this.mLocation = mLocation;
        this.mDate = mDate;
        this.mTime = mTime;
    }
    /** Title of the earthquake event */
//    public final String title;

    /** Time that the earthquake happened (in milliseconds) */
//    public final long time;

    /** Whether or not a tsunami alert was issued (1 if it was issued, 0 if no alert was issued) */
//    public final int tsunamiAlert;

    /**
     * Constructs a new {@link Event}.
     *
     * @param eventTitle is the title of the earthquake event
     * @param eventTime is the time the earhtquake happened
     * @param eventTsunamiAlert is whether or not a tsunami alert was issued
     */
//    public Event(String eventTitle, long eventTime, int eventTsunamiAlert) {
//        title = eventTitle;
//        time = eventTime;
//        tsunamiAlert = eventTsunamiAlert;
//    }


}
