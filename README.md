# Java library for CurseApp
 

## Contributions
* We take contributions for improving the library
    * Please create feature branches and issue pull requests for the FTB Dev team to review before merging
* API Compatibility breaks MUST have version bumps to prevent breaking end users

## Building
* this library uses the gradle build system
* to build run `./gradlew build`
* artifacts are located in the `build/libs` folder

## Artifacts
* the main artifact is not shaded
* the javadocs & sources jars contain library javadoc/sources
* -all is a shaded jar with all dependencies
* -mc is a shaded jar with all dependencies shipped in minecraft removed
* -mcnoslf4j is a the mc jar without slf4j 

## sample code
* various sample usage code exists under the following packages:
    * com.feed_the_beast.javacurselib.examples.app_v1
    * com.feed_the_beast.javacurselib.examples.tools
    
    
## Maven Information
* javadoc & source jars are uploaded as well
* The library is deployed to progwml6's maven repo 
```
maven {
    name = 'DVS1'
    url = 'http://dvs1.progwml6.com/files/maven'
}
```
and can be added as a gradle dependency as follows:
```
dependencies {
    compile 'com.feed_the_beast:javacurseapi:0.1.0.+'
}
```

## Project Lombok
* This project uses Lombok, for some IDE's plugins are required for lombok to work properly
 * For Eclipse: https://projectlombok.org/setup/eclipse
 * For Intellij: https://projectlombok.org/setup/intellij
 * General Information: https://projectlombok.org/

