# ComposeNavigationDemo
This is a sample flow that I applied after integerating with <a href="https://composedestinations.rafaelcosta.xyz">Compose Destinations Library</a>

## KSP library
A KSP library that processes annotations and generates code that uses Official Jetpack Compose Navigation under the hood. It hides the complex, non-type-safe and boilerplate code you would have to write otherwise. </br>
No need to learn a whole new framework to navigate - most APIs are either the same as with the Jetpack Components or inspired by them.

<p align="center"> 
   <img height="250" src="https://user-images.githubusercontent.com/80427734/147891822-5cd34c80-8dca-4d34-8278-2aa3bf36913f.png"/> 
</p>

# This flow shows you :
- How to create simple destination?
- How to create nested graphs?
- How to navigate to other destinations ?
- How to navigate to other destinations with arguments (primitives,serializable)?
- How to popstack to certain route?

# Flow summary :
- We have 6 destinations in this sample [home,details,items,more,profile,settings].
- We have 2 main graphs in this sample [home(start) , more).
- Home graph contains these destinations [home(start), items, details].
  - we have the home screen which represent start destination of this graph.
  - we can navigate to items screen from home screen and then navigate to details screen.
  - we have also the option to navigate back to home screen.
- More Graph contains these destinations [more(start), profile, settings].
  - we have the more screen which represent start destination of this graph.
  - we can navigate to profile/settings screen with arguments from more screen.
  - we have also the option to navigate back to more screen.

