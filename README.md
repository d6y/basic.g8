# A [Giter8][g8] template my Scala development.

# Usage

```
$ sbt new d6y/basic.g8
[info] Loading settings from idea.sbt,sbt-updates.sbt,sonatype.sbt ...
[info] Loading global plugins from /Users/richard/.sbt/1.0/plugins
[info] Loading settings from plugins.sbt ...
[info] Loading project definition from /Users/richard/Developer/basic/project
[info] Loading settings from build.sbt ...
[info] Set current project to basic (in build file:/Users/richard/Developer/basic/)
[info] Set current project to basic (in build file:/Users/richard/Developer/basic/)
name [Project Name]: Self Driving AI Blockchain
package [foo]: skynet

Template applied in ./self-driving-ai-blockchain

~/Developer/basic (master) $ cd self-driving-ai-blockchain

$ tree -I target
.
├── LICENSE.md
├── README.md
├── build.sbt
├── project
│   ├── build.properties
│   └── coursier.sbt
└── src
    ├── main
    │   └── scala
    │       └── skynet
    │           └── Main.scala
    └── test
        └── scala
            └── skynet
                ├── ExampleCheck.scala
                ├── ExampleSpec.scala
                └── Spec.scala

8 directories, 9 files
```


# Template license
Written in 2018 by Richard Dallaway

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
