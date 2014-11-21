Sclannotation: Scala annotation scanner

::

  import sclannotation.Scanner
  Scanner.

How it works?
-------------

`Sclasner <https://github.com/xitrum-framework/sclasner>`_ is used to get a
list of all available .class files in classpath.

Because currently there's `no easy way to read Scala annotations from .class
files directly <https://groups.google.com/forum/#!topic/scala-user/B-8RRL0Pr0g>`_,
the class loader of the current thread is used to load the class.

Scala annotations are then extracted from the loaded class.
