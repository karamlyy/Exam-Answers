# Exam-Answers
4.  What is data class?

    The data class in Kotlin is used to hold the data. This data class contains some utility functions that are often derivable from the data.

    With the help of the data class, you don’t need to write the boiler plate code. The compiler automatically generates all the getter and setter for all the data class properties. Its syntax includes the data keyword with class.
5.  How to initialize array with values in Kotlin?
    We can create an array with the help of the library function arrayOf() and initialize it with any values we want.

    fun main() {
        val Cars = arrayOf("Mercedes", "Ferrari", "BMW" )
        println (Cars.contentToString())
    }

6.  What is difference between var and val?
    var is used to declare a mutable variable. A mutable variable is a variable that can be changed or that can be reassigned in the course of the program.

    val is used to declare immutable variables. Once a value is assigned to a variable with the val keyword, it cannot be altered or reassigned throughout the program. Val is similar to the final keyword in Java.
7.  How to concatenate String?
    To concatenate strings in Kotlin, you can use concatenation operator +. You may usually encounter concatenation operator as addition operator.
    example: var name = "Karam"
    
    var surname = "Afandi"
    
    var fullName = name + " " + surname // result: Karam Afandi
    println("Hello, $name")

8.  What is variable declaration with ? mark
    The Kotlin programming language uses the question mark (?) symbol for many of its null safety features.
    To allow null in your variable, you need to add a question mark ? after the variable type: var myString: String? = null. The variable then becomes a nullable String type, which can hold the null value.

    Null safety is a feature of modern programming languages created to reduce (or eliminate) the danger of referencing null values in your source code.
11. What is the life cycle of Android activity?
    The Android activity lifecycle starts with the onCreate() method. This method is called when the user clicks on your app’s icon, which causes this method to create the activity. This method is required for every activity, as it sets the layout.

    After views have been initialized and the layout has been set in the onCreate() method, the onStart() method is called. This method makes the activity visible to the user.
    
    After the activity is visible to the user, the onResume() method is called when the user starts interacting with it. The activity will continue being in this state until the user leaves the activity.
    
    When the user leaves the current activity, the system pauses all operations occurring on the activity and calls the onPause() method. This method is also crucial, because it is used to save the user’s data on the activity as the user moves to another.
    
    When the user presses the back button or navigates to another activity, the onStop() method is called since the activity is no longer visible to the user. You can also save the user’s data on this method.
    
    This method is called before the system destroys the activity. An activity may be destroyed due to a change in a configuration, such as when the user changes the device orientation and locale.

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
