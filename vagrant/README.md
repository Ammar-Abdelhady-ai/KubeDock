# Vagrant Automated Provisioning

This directory contains Vagrantfiles and shell scripts for automated environment setup across different operating systems and architectures.

## 🏗️ Supported Environments

### 💻 Windows & Mac (Intel)
- **`Automated_provisioning_WinMacIntel/`**: Full automation including DB, App, Cache, and MQ.
- **`Manual_provisioning_WinMacIntel/`**: Step-by-step setup for troubleshooting.

### 🍎 Mac (Apple Silicon/M1)
- **`Automated_provisioning_MacOSM1/`**: Optimized for ARM64 virtualization.
- **`Manual_provisioning_MacOSM1/`**: Manual setup for M1 Macs.

## 🚀 How to Start

1.  Navigate to your environment folder:
    ```bash
    cd Automated_provisioning_WinMacIntel
    ```

2.  Bring up the virtual machines:
    ```bash
    vagrant up
    ```

## 🛠️ Components
Each environment provisions:
- **`mysql.sh`**: Database setup.
- **`memcache.sh`**: Caching layer.
- **`rabbitmq.sh`**: Message broker.
- **`tomcat.sh`**: Application server.
- **`nginx.sh`**: Web server/Load Balancer.
