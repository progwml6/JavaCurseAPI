#Java library for CurseApp
 
# THIS LIBRARY IS NOT TO BE PUT IN OPEN SOURCE PROJECTS YET
* Curse api's are not released to the general public, when they are this library will be made public and usable for open source projects as well
* for this reason the library has not been placed on a maven repo
* to order to add this library in jar form from a folder in a gradle project:
    * add `compile fileTree(dir: 'libs', include: ['*.jar'])` to the dependencies section of your build.gradle
    * place the library jar of choice in a folder called `libs`
 
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