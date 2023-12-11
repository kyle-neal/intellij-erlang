
To build just use `./gradlew build`. Java 17 must be installed and set as default (I'm on `ubuntu jammy`)
```
# Print OS version
kyle@spawn:/opt/intellij-erlang$ lsb_release -a
No LSB modules are available.
Distributor ID: Ubuntu
Description:    Ubuntu 22.04.3 LTS
Release:        22.04
Codename:       jammy

# Install java 17
kyle@spawn:/opt/intellij-erlang$ sudo apt install openjdk-17-jdk

# Set java17 as default
kyle@spawn:/opt/intellij-erlang$ sudo update-alternatives --config java
There are 3 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                            Priority   Status
------------------------------------------------------------
* 0            /usr/lib/jvm/java-17-openjdk-amd64/bin/java      1711      auto mode
  1            /usr/lib/jvm/java-11-openjdk-amd64/bin/java      1111      manual mode
  2            /usr/lib/jvm/java-17-openjdk-amd64/bin/java      1711      manual mode
  3            /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1081      manual mode

Press <enter> to keep the current choice[*], or type selection number: 0

# Build intellij-erlang
kyle@spawn:/opt/intellij-erlang$ ./gradlew build
...
BUILD SUCCESSFUL in 2m 7s
```

Resulting file will wind up in `build/distributions/intellij-erlang-0.11.SNAPSHOT.zip`. Then it can be installed via `Install plugin from disk...` in intellij after disabling the official plugin. Restart IDE and erlang features should work again.
