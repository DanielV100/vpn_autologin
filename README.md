
# Autologin to VPN

This tool helps you to automatically login to Cisco AnyConnect without typing username and password all the time.





## Installation

1. Install vpn_autologin via terminal

```bash
  https://github.com/DanielV100/vpn_autologin.git
```

2. Open the project then in your IDE (InelliJ recommended) and open
   **AutoLoginVPN.java** in **src**-folder.

3. Adjust following variables:
   `long sleepMillis = 5000;`

`String username = "max.mustermann@mail.com";`

`String password = "ThisIsAPassword!";`

4. Now do the deployment



## Deployment

1. In IntelliJ go to **File > Project Structure > Artifacts** and add (+) a jar from modules with dependencies (first option)

2. Click on the folder symbol next to main class and choose **AutoLoginVPN.java**

3. Click on **OK**, then **apply** and **OK**

4. Now go to **Build > Build Artifacts > AutoLoginVPN.jar > Build**

5. After successfull building you can see a folder **out** in the project structure (left-handed side). Navigate to the folder **artifacts** and open in in your Finder.

6. Copy and paste the **AutoLoginVPN.jar** wherever you want!

7. Now on your mac go to **System Preferences > Security & Privacy Preferences > Privacy > Full Disk Access** and add **JavaLauncher** (`/System/Library/CoreServices/Jar Launcher.app`)to the list

8. Do the same for **System Preferences > Security & Privacy Preferences > Privacy > Accessibility**

9. Now you can start the .jar via double clicking it! :)


