# 25-Alpha

## Repository Setup
**Make sure you are logged into GitHub as `841student`**

### Clone this repository
Click on the green `<> Code` button and copy the URL `https://github.com/Team841/25-Alpha.git`
![README images\git clone.png](https://github.com/Team841/25-Alpha/blob/6a4490de7e4bc38de89edbfab2fabbcfa6580c2a/README%20images/git%20clone.png){width=100}

### Open in VSCode
* Open VSCode
* In the sidebar, select the 3rd item, `Source Control`. Looks like: branch with circles on the ends.
* `Clone Repository` and paste the URL from above. Hit `<enter>`.
![README images\VsCode Clone Git.png](https://github.com/Team841/25-Alpha/blob/26c6bdb7ae275f7367ead4a85beed891c9628d6a/README%20images/VsCode%20Clone%20Git.png){width=500}
* Change the location where this lives to `C:git`. If this location does not exist, create a new folder called `git` in `C:`

You should now have the repo set up in VSCode.

### After making some changes
* "Stage" your all changes by clicking `+` in the Changes row of the Source Control browser, or only some files by clicking `+` for some of the files only.
* Type a descriptive message for the changes you are committing in the Message field
* Click `Commit` when you are done.
* `Sync Changes` to push your commit(s) to the remote (GitHub)

**If you are the first to use this laptop**
You may be prompted to sign in / authorize git
* Sign in with browser
* `Authorize git-ecosystem`
* Go back to VSCode

If you get errors, talk to a mentor! You may need to set up the git user.name for the computer.
```
git config --global user.name "<laptop name>"
```

**Now, others will need to `Fetch` (circular arrows in the bottom left next to the branch name) to pull your changes.**