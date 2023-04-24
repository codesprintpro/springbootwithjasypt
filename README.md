# springbootwithjasypt
Sample project on how to use Jasypt with Springboot

Command for generating encrypted value

     mvn jasypt:encrypt-value -Djasypt.encryptor.password={jasypt_secretkey} -Djasypt.plugin.value=password
In this command *jasypt_secretkey* is the secret key used by Jasypt for enrypting and decrypting the content.

  
Make sure to add following line in your vm options

	-Djasypt.encryptor.password=jasypt_password
