apt-get update -y && apt-get upgrade -y

apt-get install openjdk-11-jdk

nano ~/.zshrc

export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
export PATH=$PATH:$JAVA_HOME/bin