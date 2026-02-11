def call(String credId,String imageName){
    withCredentials([usernamePassword(credentialsId:"${credId}",
                    passwordVariable: "dockerhubPass",
                    usernameVariable: "dockerhubUser"
                )]){

                    sh "docker login -u ${env.dockerhubUser} -p ${env.dockerhubPass}"
                    sh "docker tag ${imageName} ${env.dockerhubUser}/${imageName}"
                    sh "docker push ${env.dockerhubUser}/${imageName}:latest"
}
