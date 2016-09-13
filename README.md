#Java library for CurseApp
 
# Please read the ENTIRE README Before using this in a project!
## Rules for releasing projects using this library
* Open sourcing projects are allowed with the following restrictions:
    * nothing that exposes the API should be public
    * Examples include but are not limited to Curse API URLS, and API documentation 
* If you have questions as to usages that are acceptable or not, feel free to ask in the API Chat on Curse
* Curse api's are not released to the general public, when they are this library will be made fully public under the Apache 2 License 

## Contributions
* We take contributions for improving the library
    * Please create feature branches and issue pull requests for the FTB Dev team to review before merging
* API Compatibility breaks MUST have version bumps to prevent breaking end users
* 
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
* please see above information on restrictions for using the library
* javadoc & source jars will not be provided until the library can be made open source
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

