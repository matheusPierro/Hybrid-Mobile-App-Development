---
marp: true
theme: default
class: invert
---

## Configurando Variáveis de Ambiente no Mac

---
A configuração das variáveis de ambiente é um passo importante para garantir que o Android Studio e o SDK do Android funcionem corretamente no seu sistema. Siga os passos abaixo para configurar as variáveis de ambiente no macOS:

---
# Passo 1 
 Abra o Terminal

   - No macOS, você pode encontrar o Terminal no Launchpad, na pasta "Utilitários" dentro da pasta "Aplicativos".

---

# Passo 2

 Abra o arquivo .bash_profile ou .zshrc:
   - Dependendo da versão do macOS e das configurações do seu shell, você precisará editar o arquivo .bash_profile ou .zshrc. O Terminal geralmente abre o arquivo de perfil correspondente automaticamente. Se não abrir, você pode digitar o seguinte comando no Terminal para editar o arquivo .bash_profile:
   
   ```
   open -e ~/.bash_profile
   ```
   
   Ou, se estiver usando o shell zsh, você pode editar o arquivo .zshrc da seguinte forma:
   
   ```
   open -e ~/.zshrc
   ```
---
# Passo 3
  Adicione as variáveis de ambiente:
   - No arquivo .bash_profile ou .zshrc, adicione as seguintes linhas (substitua os caminhos pelos caminhos reais onde você instalou o Android Studio e o SDK):
   
   # Configuração do Android Studio
   

   ```
   export ANDROID_HOME=/caminho/para/android/sdk
   export PATH=$PATH:$ANDROID_HOME/emulator
   export PATH=$PATH:$ANDROID_HOME/tools
   export PATH=$PATH:$ANDROID_HOME/tools/bin
   export PATH=$PATH:$ANDROID_HOME/platform-tools
   ```
   Certifique-se de substituir "/caminho/para/android/sdk" pelo caminho real onde você instalou o SDK do Android. Por exemplo, se você instalou o Android Studio na pasta "Applications" (Aplicativos), o caminho pode ser "/Applications/Android Studio.app/sdk".

---
# Passo 4
 Salve o arquivo e feche o editor.

Este é o exemplo de como ficou no meu MAC. A e no meu caso eu utilizo .zshrc 

```
export ANDROID_HOME=/Users/mvalbuquerque/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/emulator
export PATH=$PATH:$ANDROID_HOME/tools
export PATH=$PATH:$ANDROID_HOME/tools/bin
export PATH=$PATH:$ANDROID_HOME/platform-tools
```

---
# Passo 5

 Atualize as variáveis de ambiente no Terminal:
   - Para que as alterações tenham efeito, você precisará recarregar o arquivo .bash_profile ou .zshrc. Digite o seguinte comando no Terminal:
   
   ```
   source ~/.bash_profile
   ```
   
   Ou, se estiver usando o shell zsh:
   
   ```
   source ~/.zshrc
   ```
---

# Passo 6
  
   Verifique as variáveis de ambiente:
   - Para verificar se as variáveis de ambiente foram configuradas corretamente, digite o seguinte comando no Terminal:
   
   ```
   echo $ANDROID_HOME
   ```

   O retorno deve de ser algo assim

   ```
   /Users/mvalbuquerque/Library/Android/sdk
   ```
   Você deve ver o caminho que você configurou anteriormente para o diretório do SDK do Android.

---
# Conclusão 

Agora as variáveis de ambiente estão configuradas corretamente para o Android Studio no seu macOS. Isso permitirá que o Android Studio e as ferramentas do SDK do Android sejam acessíveis em qualquer localização do Terminal. 
Você pode iniciar o Android Studio normalmente e começar a desenvolver aplicativos Android!

#Divirta-se!
Profº [Vinny Albuquerque](http://www.linkedin.com/in/mvalbuquerque)