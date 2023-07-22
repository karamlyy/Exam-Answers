# Exam-Answers
12. What is AndroidManifest?
    Every Android App must have Manifest file. It is information about an Android application is contained in the Android App Manifest. At the base of the source set, there is a single AndroidManifest.xml file for each application. Android App Manifests are used by the Android operating system and digital distribution platforms (Google Play) to locate details(version) about an application, including its name, entry point, support for hardware features, Android version, and permissions.

13. What is intent?
    Android Intent is the message that is passed between components such as activities, content providers, broadcast receivers, services etc.
    It is generally used with startActivity() method to invoke activity

14. Which layouts do you know?
    Android Layout is used to define the user interface that holds the UI controls or widgets that will appear on the screen of an android application or activity screen.
    Constraint Layout: ConstraintLayout allows you to create large and complex layouts with a flat view hierarchy (no nested view groups). It’s similar to RelativeLayout in that all views are layered out according to relationships between sibling views and the parent layout, but it’s more flexible than RelativeLayout and easier to use with Android Studio’s Layout Editor.
    Linear Layout: LinearLayout is the most basic layout in android studio, that aligns all the children sequentially either in a horizontal manner or a vertical manner by specifying the android:orientation attribute.
    Relative Layout: Android RelativeLayout is a ViewGroup subclass, used to specify the position of child View elements relative to each other like (A to the right of B) or relative to the parent (fix to the top of the parent).