Reverse Tally
Reverse Tally is a turn-based game where two players (or one player vs. computer) take turns adding points to their score. If a score is a multiple of 6, the players’ scores are swapped. The first player to reach or exceed a score of 15 loses.

Game Features
Game Modes:

Player vs. Player: Play with a friend.
Player vs. Computer: Challenge the AI.
Scoring Dynamics:

Add points between 1 and 5 on each turn.
Scores swap when the total reaches multiples of 6.
Win Condition:

Avoid being the first to reach or exceed a score of 15.
Folder Structure
plaintext
Copy code
Reverse_Tally/
├── .idea/               # Android Studio configuration files
├── app/                 # Source code for the Android application
│   ├── src/
│   │   ├── main/        # Main source code
│   │   │   ├── java/    # Java source files
│   │   │   │   └── MainActivity.java
│   │   │   ├── res/     # UI layouts and resources
│   │   │   └── AndroidManifest.xml
├── gradle/              # Gradle wrapper
├── .gitignore           # Git ignore rules
├── build.gradle.kts     # Build configuration (Kotlin script)
├── gradle.properties    # Gradle properties
├── gradlew              # Gradle wrapper (Unix)
├── gradlew.bat          # Gradle wrapper (Windows)
├── settings.gradle.kts  # Project settings
How to Run
Prerequisites
Android Studio installed on your machine.
Java Development Kit (JDK 11+) installed.
Steps to Run
Clone the repository:

bash
Copy code
git clone https://github.com/Talia04/Reverse_Tally.git
cd Reverse_Tally
Open the project in Android Studio.

Sync the Gradle files.

Run the application:

Use an Android emulator or a physical device connected to your system.
Click the Run button in Android Studio or press Shift + F10.
About the Project
This Android app demonstrates:

Interactive Gameplay: Dynamic score-swapping mechanics.
User Interface Design: Built with Android layouts and activities.
Game Logic Implementation: Developed in Java, leveraging modular and reusable components.
Contributing
Feel free to contribute by:

Reporting issues or suggesting features via GitHub issues.
Opening pull requests with proposed changes or fixes.

Contributors:
Tanyaradzwa Chisepo
Bongiwe Mkwananzi
Buchizya Mwase
Uchenna Njoku
