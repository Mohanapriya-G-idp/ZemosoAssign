pipeline {
    agent any
    
    stages {
         stage('Build') {
            steps {
                sh 'javac Assi1.java' // Compile the Java file
            }
        }
        stage('Test') {
            steps {
                sh 'java Assi1' // Run the compiled Java file
            }
    }
}
}
