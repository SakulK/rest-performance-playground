[Yesod](http://www.yesodweb.com/) implementation
================================================

You need the haskell-platform installed, on Ubuntu run this command:

`sudo apt-get install haskell-platform`

Then to build the application run:

`cabal clean && cabal configure && cabal build`

And to run the application for testing:

`./dist/build/rest-playground/rest-playground Production`