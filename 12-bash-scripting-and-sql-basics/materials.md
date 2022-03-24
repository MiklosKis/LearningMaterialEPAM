###### Test Automation Mentoring Program 2021

## Module 12 - Bash scripting- and SQL basics

##### Module material

###### Bash scripting basics
![Bash](img/bash.png)

* LinkedIn Learning (mandatory): Learning Bash Scripting
    * https://learn.epam.com/detailsPage?id=8e429137-938c-414f-b5a8-0ebd398d3812

* Pluralsight (mandatory):
    * https://app.pluralsight.com/courses/introduction-bash-shell-linux-mac-os/  
    (except _"Jobs and Processes"_ and _"Customization"_ modules)  

* Others (optional, but useful):
    * https://www.youtube.com/watch?v=sYwr0HMudRg&list=PLlpCYzlw8-CagGcorCV2DCdnkS9IAU9Ab  
    (optional videos: 08, 10-18, 21-28, 32, 33)
    * http://www.learnshell.org

---

###### SQL basics
![SQLite](img/sqlite.png)

* LinkedIn Learning (mandatory): SQL Essential Training
    * https://learn.epam.com/detailsPage?id=b20e8256-6fd5-4b65-b754-1a65955626a0


* Pluralsight (mandatory):
    * https://app.pluralsight.com/courses/introduction-to-sql/  
    (except _"Matching Different Data Tables with JOINs"_ and _"Creating Database Tables"_ modules)

* Others (optional, but useful):
    * http://www.tutorialspoint.com/sqlite

---

###### Docker (Optional)
![SQLite](img/docker.png)

* LinkedIn Learning:
    * Learning Docker: https://www.linkedin.com/learning/learning-docker-2018
    
* Docker official page: https://docs.docker.com/

##### Environment setup

###### Install Docker Desktop

Download and Install Docker Desktop with Hyper-V requiremnts:<br/>
https://docs.docker.com/docker-for-windows/install/
* Enable Hyper-V: https://docs.microsoft.com/en-us/virtualization/hyper-v-on-windows/quick-start/enable-hyper-v

###### Optional Environment setup
Windows Subsystem for Linux (WSL2) <br />
https://docs.microsoft.com/en-us/windows/wsl/install-win10#manual-installation-steps
You will have a Linux system under Windows, and you can use it as a Linux OS
If you install WSL 2, you should be doing it before the Docker Desktop installation



##### Useful commands

`pwd` : print name of the current directory  
`ls` : list directory contents  
`ll` : list directory contents (long listing format, same as `ls -l`)  
`wc -w FILE` : count words in a file  
`wc -l FILE` : count lines in a file  
`touch NAME` : create file with the specified name  
`mkdir NAME` : create directory with the specified name  
`rm FILE` : remove file  
`rm -r DIR` : remove directory  
`cd NAME` : change directory  
`cd ~` : go back to your home directory (where _'homework'_ is located)  
`cd ..` : go back to the parent directory  
`cp SOURCE DEST` : copy file from SRC to DST  
`cp -r SOURCE DEST` : copy folder from SOURCE to DEST  
`mv SOURCE DESC` : move file/folder from SOURCE to DESC  
`mv NAME_OLD NAME_NEW` : rename a file/folder  

`echo "Hello World!"` : print _'Hello World!'_ message to the standard output  
`echo "Hello World!" > FILE` : redirect the output of _'echo'_ command to the specified file (its content will be overwritten)  
`echo "Hello World!" >> FILE` : redirect the output of _'echo'_ command to the specified file (output will be concatenated to the end of the file)  
_**NOTE:**_ you can redirect the output of any command  

`nano -w FILE` : edit the specified file with nano editor  
_**NOTE:**_ you can save your document with `CTRL+o` (then hit enter) and exit with `CTRL+x`  

`COMMAND --help` : description about how the command works (in most cases)  
`sudo COMMAND` : execute the command as root (super user)  
`sudo reboot` : reboot your virtual machine  
`sudo poweroff` : turn off your virtual machine  
`sudo loadkmap < /usr/share/kmap/qwertz/hu.kmap` : set keyboard layout to hungarian (default)  
`sudo loadkmap < /usr/share/kmap/qwerty/us.kmap` : set keyboard layout to US english  

`CTRL+l` : clear screen  
`CTRL+c` : kill process (e.g. if you have an infinite loop)  
`SHIFT+PAGE UP/DOWN` : scroll up/down  
_**NOTE:**_ use left `CTRL` since right one is the VirtualBox host key by default  

`sqlite3 DATABASE "SQL_STATEMENT"` : execute the specified SQL statement on the specified database (e.g. `sqlite3 tam2020.db "select * from mentees;"`)  
