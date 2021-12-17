# Untuk Installasi

apt-get update -y && apt-get upgrade -y

apt-get install openjdk-11-jdk

# Export PATH
nano ~/.zshrc
- export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
- export PATH=$PATH:$JAVA_HOME/bin

untuk menutupnya ctrl + x, y terus enter

# Restart Config ZSH
source ~/.zshrc

# Tes Running
- java --version
- javac --version

# Untuk Compile
- javac Main.java

# Untuk Run
- java Main