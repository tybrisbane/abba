
Building with your installed Java 22
------------------------------------
You do NOT need to install Java 21. This project tells Gradle to:
  - auto-download a JDK toolchain for the build, and
  - use Vineflower as the decompiler (avoids CFR/Java 22 issues).

Steps:
  1) Copy meteor-client-1.21.5-54.jar into the libs/ folder.
  2) Open Command Prompt here.
  3) Run:  gradlew.bat clean build
  4) Grab build\libs\grimscaffold-1.0.0.jar and drop into .minecraft\mods\
