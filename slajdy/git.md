% Git 



# Intro

## About
<img style="width: 40%" src="https://git-scm.com/book/en/v2/images/distributed.png"/>

## Brief History


<div style="width: 30%; font-size: 80%;  float:right">

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/LinuxCon_Europe_Linus_Torvalds_03_%28cropped%29.jpg/800px-LinuxCon_Europe_Linus_Torvalds_03_%28cropped%29.jpg"/>

<div class="clicker" tabindex="1" onclick="window.dispatchEvent(new Event('resize'))"></div>
<div class="hiddendiv">
Linus Torvalds
</div>  

</div>

<div style="width: 65%; font-size: 80%">
Design criteria:

* patching should take no more than three seconds
* Take `CVS` as an example of what not to do; if in doubt, make the exact opposite decision.
* Support a distributed workflow (BitKeeper-like)
* Include very strong safeguards against corruption, either accidental or malicious.


Begin development 3 Apr 2005 -> 16 Jun 2005 used to host Linux 2.6.12
</div>
## Features

### Snapshots, Not Differences 
![](https://git-scm.com/book/en/v2/images/deltas.png)
![](https://git-scm.com/book/en/v2/images/snapshots.png)

### Operations Are Local


### Integrity


```
24b9da6552252987aa493b52f8696cd6d3b00373
```

### Git Generally Only Adds Data

### The Three States
![](https://git-scm.com/book/en/v2/images/areas.png)

### Git book


<img alt="Git book" style="width: 40%" src="git-book.png"/>

[https://git-scm.com/book](https://git-scm.com/book)



# Start

## Install

[https://git-scm.com/downloads](https://git-scm.com/downloads)

## Starting with repo

1) Init
```
git init
```

2) Clone
```
git clone ...
```

## Getting started - tasks

* <a href="git-tasks.html#/zadanie-1" target="_blank">[Task 1]</a>
* <a href="git-tasks.html#/zadanie-2" target="_blank">[Task 2]</a>

# Saving changes

## Untracked vs Tracked
    
![](https://git-scm.com/book/en/v2/images/lifecycle.png)
   
<a href="https://git-scm.com/book/en/v2/Git-Basics-Recording-Changes-to-the-Repository" target="_blank">[reference]</a>

## Checking the Status of Your Files
* `git status`

## Tracking New Files
* create new file
* `git add ...`

## Staging Modified Files
* modify
* `git status`
* `git add ...`

<!-- ## ~Short Status~ -->

## Ignoring Files
`.gitignore`

## Viewing Your Staged and Unstaged Changes

* `git status`

* `git diff`

* `git diff --staged`

<a href="https://git-scm.com/book/en/v2/Git-Basics-Recording-Changes-to-the-Repository" target="_blank">[reference]</a>



## Committing Your Changes



<!-- ## ~Skipping the Staging Area~ -->

## Saving changes - tasks

* <a href="git-tasks.html#/zadanie-3" target="_blank">[Task 3]</a>
* <a href="git-tasks.html#/zadanie-4" target="_blank">[Task 4]</a>
* <a href="git-tasks.html#/zadanie-5" target="_blank">[Task 5]</a>




# Managing changes 

## Removing Files from Repository

`git rm`

<a href="https://git-scm.com/docs/git-rm" target="_blank">[reference]</a>



## Moving files

`git mv ...`

<a href="https://git-scm.com/docs/git-mv" target="_blank">[reference]</a>



## Viewing the Commit History

* `git log`


https://git-scm.com/book/en/v2/Git-Basics-Viewing-the-Commit-History
 
    

## Managing changes - tasks

* <a href="git-tasks.html#/zadanie-6" target="_blank">[Task 6]</a>
* <a href="git-tasks.html#/zadanie-7" target="_blank">[Task 7]</a>
* <a href="git-tasks.html#/zadanie-8" target="_blank">[Task 8]</a>




# Undoing Things

## Modifying last commit

`git commit --amend`

## Unstaging a Staged File

`git reset HEAD README.md`

## Unmodifying a Modified File

`git checkout -- README.md`

## Reverting changes

`git revert <commit-id>`

E.g. `git revert cdd5117`

<!-- ### ~Git Basics - Git Aliases~ 
https://git-scm.com/book/en/v2/Git-Basics-Git-Aliases
-->

## Undoing Things - tasks


* <a href="git-tasks.html#/zadanie-9" target="_blank">[Task 9]</a>
* <a href="git-tasks.html#/zadanie-10" target="_blank">[Task 10]</a>
* <a href="git-tasks.html#/zadanie-11" target="_blank">[Task 11]</a>



# Git Branching
 
## Branches

A branch in Git is simply a lightweight movable pointer to one of commits.

<img src="https://git-scm.com/book/en/v2/images/basic-branching-1.png" style="width: 70%"/>

* Create branch: `git branch <branch-name>`
* Switching Branches: `git checkout <branch-name>` 

## Basic Branching

To create a new branch and switch to it at the same time:

`git checkout -b <branch-name>`


This is shorthand for:

```
git branch <branch-name>
git checkout <branch-name>
```



## Basic Merging

Merge scenario:

* switch to new branch: `git checkout -b <another-branch>`
* change something, e.g. `vim index.html`
* commit changes, e.g. `git commit -a -m 'fixed whatever'`
* back to main branch, e.g. `git checkout master`
* merge `<another-branch>` into `master`, e.g. `git merge <another-branch>`


<a href="https://git-scm.com/book/en/v2/Git-Branching-Basic-Branching-and-Merging" target="_blank">[reference]</a>

## Merge: Fast-Forward vs 3-Way

![](fast-forward-merge.jpg)

## Merge conflicts

If you changed the same part of the same file differently in the two branches you’re merging, Git won’t be able to merge them cleanly. 

```
git merge <another-branch>
```
```
Auto-merging index.html
CONFLICT (content): Merge conflict in index.html
Automatic merge failed; fix conflicts and then commit the result.
```

## Branch Management

* Get a simple listing of current branches: `git branch`

* See the last commit on each branch: `git branch -v`

* Deleting branch:

  * `git branch -d <branch-name>`

  * `git branch -D <branch-name>` - if branch is not merged

<a href="https://git-scm.com/book/en/v2/Git-Branching-Branch-Management" target="_blank">[reference]</a>

## Branching - tasks

* <a href="git-tasks.html#/zadanie-14" target="_blank">[Task 14]</a>
* <a href="git-tasks.html#/zadanie-15" target="_blank">[Task 15]</a>
* <a href="git-tasks.html#/zadanie-16" target="_blank">[Task 16]</a>
* <a href="git-tasks.html#/zadanie-17" target="_blank">[Task 17]</a>
* <a href="git-tasks.html#/zadanie-18" target="_blank">[Task 18]</a>
* <a href="git-tasks.html#/zadanie-19" target="_blank">[Task 19]</a>


## Branching Workflows

Long-Running Branches and Topic Branches

![](https://git-scm.com/book/en/v2/images/lr-branches-2.png)

<a href="https://git-scm.com/book/en/v2/Git-Branching-Branching-Workflows" target="_blank">[reference]</a>


## Git Flow

<img src="5488984404_c37e1d60a2_o.png" style="float:right; width: 40%">

* The main branches
    * `master`
    * `develop`
* Supporting branches
    * Feature branches
    * Release branches
    * Hotfix branches


<a href="https://nvie.com/posts/a-successful-git-branching-model/" target="_blank">[reference]</a>


## Rebasing

Using `rebase` you can take all changes that committed on one branch 
and replay them on a different branch.

E.g. You can check out the `experiment` branch, and then `rebase` it onto the `master` branch as follows:


```
git checkout experiment
git rebase master
```
![](https://git-scm.com/book/en/v2/images/basic-rebase-3.png)

<!--

# Tags
* annotated
* light
https://git-scm.com/book/en/v2/Git-Basics-Tagging
-->


## Interactive rebase

```
git rebase -i <commit-id>
```

* changing multiple commit messages

* reordering commits

* squashing commits

* splitting a commit

## Rebasing - tasks *

* <a href="git-tasks.html#/zadanie-20" target="_blank">[Task 20]</a>
* <a href="git-tasks.html#/zadanie-21" target="_blank">[Task 21]</a>



# Working with Remotes

<a href="https://git-scm.com/book/en/v2/Git-Basics-Working-with-Remotes" target="_blank">[reference]</a>


## Showing Your Remotes

The easiest way to configure remote is to clone from existing remote repository 

* `git clone <url>`

To see what remote servers are configured:

* `git remote`

* `git remote -v`

## Managing Remote Repositories

Remote can also be configured explicitly:

* `git remote add <name> <url>`

and managed:

* `git remote remove <name>`

* `git remote rename <old-name> <new-name>`

## Fetching and Pulling from Your Remotes



To get data from remote projects:

* `git fetch <remote-name>`
  - only downloads data but doesn't merge


* `git pull <remote-name>`
  - fetches and tries to merge

## Pushing to Your Remotes

Push changes upstream, to share the project:
 
* `git push <remote-name> <branch-name>`
 
* e.g. `git push origin master`

## Inspecting a Remote

If you want to see more information about a particular remote, you can use the `git remote show <remote-name>`


## Remotes - tasks *

* <a href="git-tasks.html#/zadanie-22" target="_blank">[Task 22]</a>
* <a href="git-tasks.html#/zadanie-23" target="_blank">[Task 23]</a>
* <a href="git-tasks.html#/zadanie-24" target="_blank">[Task 24]</a>
* <a href="git-tasks.html#/zadanie-25" target="_blank">[Task 25]</a>


# Pull Request

Pull requests let you tell others about changes you've pushed to a branch in a repository.

* from another branch - usually possible within one team / company (not public repositories)  

* from forked repository - common in open source projects - If you don't have access to create branches on that repository, there is no way to create a pull request without forking.  


References
[1] https://git-scm.com/book/en/v2


# The end