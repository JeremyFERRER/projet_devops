node {
    def app

    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */
        checkout scm
    }

    stage('Build ') {
        sh "mvn -B -DskipTests clean package"
    }

    stage('Test App') {
      steps {
        sh 'mvn test'
      }
      post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
      }
    }

    /* stage('Run App') {
        def image = docker.build("${nexus_registry}/${qlik_sse_docker_img}:${package_version}", "-f ./Dockerfile")
    } */
}