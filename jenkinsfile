pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Perform the build actions here
                sh 'make -f Makefile.build'
            }
        }
        stage('Test') {
            steps {
                // Execute tests
                sh 'make -f Makefile.test'
            }
        }
        stage('Deploy') {
            steps {
                // Deployment steps
                sh 'make -f Makefile.deploy'
            }
        }
    }
}
