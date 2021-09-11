node{
    stage("Pull"){
        git 'https://github.com/sgasimov-dotcom/jenkins-test.git'
    }
    stage("Build"){
        sh '''
            echo "Build"
        '''
    }
    stage("Test"){
        sh '''
            echo "Test"
        '''
        
        input 'Do you want to continue?'
    }
    stage("Deploy"){
        sh '''
            echo "Deploy"
        '''
    }
}