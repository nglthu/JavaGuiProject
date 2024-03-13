## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Launch.json
```
"version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "SwingExp",
            "request": "launch",
            "mainClass": "SwingExp",
            "projectName": "JFrameProject_92741cc0"
        },
        {
            "type": "java",
            "name": "App",
            "request": "launch",
            "mainClass": "App",
            "projectName": "JFrameProject_92741cc0"
        },
       
        {
            "type": "java",
            "name": "Launch Java Program",
            "request": "launch",
            "mainClass": "JFXExp",
            "projectName": "JFrameProject_92741cc0",
            "vmArgs": "--module-path /Users/lethunguyen/Java/javafx-sdk-23/lib --add-modules javafx.controls,javafx.fxml"
        },
        {
            "type": "java",
            "name": "Current File",
            "request": "launch",
            "mainClass": "${file}"
        }
    ]
}
```
