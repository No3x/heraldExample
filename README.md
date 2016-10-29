# heraldExample
Minimal working example to use herald with guice and log4j via the slf4j logger interface.

I had problems integrating herald into my project as I did not understand I had to install the `LogModule` / add it to the injector (although the readme explains this). I stopped reading carefully at:
> The project is integrated with Spring & Guice frameworks, but can be used without it:

Instead of reading the docs properly I searched for github projects actually using the library but did not find any helpful.
So this is the reason for this repository.