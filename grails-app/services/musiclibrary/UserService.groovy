package musiclibrary

import grails.transaction.Transactional

@Transactional
class UserService {

    User create(String name, String gender,String dob, String address){
        User newUser = new User()
        newUser.name = name
        newUser.gender = gender
        newUser.address = address
        newUser.dob = dob

        newUser.save()
        return newUser
    }
    User updateUser(Integer id, User user){
        def updatedUser  = User.findById(id)
        updatedUser.name = user.name
        updatedUser.gender = user.gender
        updatedUser.address = user.address
        updatedUser.dob = user.dob

        return updatedUser.save()
    }
    User userList(){
        def listOfUsers = User.list()
        return listOfUsers
    }
}
